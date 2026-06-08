import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.*;
class MusicPlayer
{
    public static void main(String args[])
    {
        String filePath =
            "C:\\Users\\harsh\\OneDrive\\Documents\\Productive Shit\\Made In Japan(1).wav";
        File file = new File(filePath);
        try 
        (Scanner sc = new Scanner(System.in);
            AudioInputStream audioStream =
            AudioSystem.getAudioInputStream(file);)
        {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            String response = "";
            while(!response.equals("Q"))
            {
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your response:");
                response = sc.next().toUpperCase();
                switch(response)
                {
                    case "P":
                    clip.start();
                    break;
                    case "S":
                    clip.stop();
                    break;
                    case "R":
                    clip.stop();
                    clip.setMicrosecondPosition(0);
                    break;
                    case "Q":
                    clip.close();
                    break;
                    default:
                    System.out.println("Invalid choice");
                }
            }
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("Unsupported audio file format");
        }
        catch(LineUnavailableException e)
        {
            System.out.println("Unable to access audio resource");
        }
        catch(IOException e)
        {
            System.out.println("Could not locate or read file");
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}