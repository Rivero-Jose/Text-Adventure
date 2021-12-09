import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;


public class AudioNotes {
	/*
	 InputStream IStream = new BufferedInputStream(this.getClass().getResourceAsStream("PSYCHICFIRE.wav"));
            
            try {
                AudioInputStream audioStream = AudioSystem.getAudioInputStream(IStream);
     
                AudioFormat format = audioStream.getFormat();
     
                DataLine.Info info = new DataLine.Info(Clip.class, format);
     
                Clip audioClip = AudioSystem.getClip();
     
                audioClip.addLineListener(this);
     
                audioClip.open(audioStream);
                
                
                audioClip.start();
                
                
                while (!playCompleted) {
                    // wait for the playback completes
                    try {
                    	
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                 
                audioClip.close();
                 
            } catch (UnsupportedAudioFileException ex) {
            	JOptionPane.showMessageDialog(null,"The specified audio file is not supported.");
                ex.printStackTrace();
            } catch (LineUnavailableException ex) {
            	JOptionPane.showMessageDialog(null,"Audio line for playing back is unavailable.");
                ex.printStackTrace();
            } catch (IOException ex) {
            	JOptionPane.showMessageDialog(null,"Error playing the audio file.");
                ex.printStackTrace();
            }
	 */
}
