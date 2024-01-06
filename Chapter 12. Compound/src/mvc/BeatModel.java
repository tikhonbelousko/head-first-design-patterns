package mvc;

import javax.sound.sampled.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BeatModel implements BeatModelInterface, Runnable {
    private static final int DEFAULT_BPM = 90;
    private List<BeatObserver> beatObservers = new ArrayList<>();
    private List<BPMObserver> bpmObservers = new ArrayList<>();
    private int bpm = DEFAULT_BPM;
    private Thread thread;
    private boolean isRunning = true;
    private Clip clip;

    public void initialize() {
        try {
            File source = new File("Chapter 12. Compound/src/mvc/drum.wav");
            clip = AudioSystem.getClip();
            try (AudioInputStream audioIn = AudioSystem.getAudioInputStream(source)) {
                clip.open(audioIn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (isRunning) {
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000 / getBPM());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void on() {
        setBPM(DEFAULT_BPM);
        notifyBPMObservers();
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public void off() {
        stopBeat();
        isRunning = false;
    }

    public void setBPM(int bpm) {
        this.bpm = bpm;
        notifyBPMObservers();
    }

    public int getBPM() {
        return bpm;
    }

    public void registerObserver(BeatObserver o) {
        beatObservers.add(o);
    }

    public void removeObserver(BeatObserver o) {
        beatObservers.remove(o);
    }

    public void registerObserver(BPMObserver o) {
        bpmObservers.add(o);
    }

    public void removeObserver(BPMObserver o) {
        bpmObservers.remove(o);
    }

    private void notifyBeatObservers() {
        for (BeatObserver o: beatObservers) {
            o.updateBeat();
        }
    }

    private void notifyBPMObservers() {
        for (BPMObserver o: bpmObservers) {
            o.updateBPM();
        }
    }

    private void stopBeat() {
        clip.setFramePosition(0);
        clip.stop();
    }

    private void playBeat() {
        clip.setFramePosition(0);
        clip.start();
    }
}
