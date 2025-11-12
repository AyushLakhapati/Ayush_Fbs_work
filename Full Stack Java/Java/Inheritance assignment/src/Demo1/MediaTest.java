package Demo1;

class MediaFile {
  
    String fileName;
    double fileSize;  
    String format;

    MediaFile() { // Default constructor
        fileName = "Untitled";
        fileSize = 0.0;
        format = "Unknown";
    }

    MediaFile(String fileName, double fileSize, String format) { // Parameterized constructor
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.format = format;
    }

    void open() {
        System.out.println("Opening media file: " + fileName);
    }

    void play() {
        System.out.println("Playing media file...");
    }

    void displayInfo() {
        System.out.println("File Name: " + fileName);
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Format: " + format);
    }
}// class mediafile ends here

class AudioFile extends MediaFile {
   
    double duration;  
    int bitrate;      
    String artistName;


    AudioFile() { //default constructor
        super();
        duration = 3.5;
        bitrate = 320;
        artistName = "Unknown Artist";
    }
    // parameterized constructor
    AudioFile(String fileName, double fileSize, String format, double duration, int bitrate, String artistName) {
        super(fileName, fileSize, format);
        this.duration = duration;
        this.bitrate = bitrate;
        this.artistName = artistName;
    }
    void playAudio() {
        System.out.println(" Playing audio: " + fileName + " by " + artistName);
    }

    void pauseAudio() {
        System.out.println(" Audio paused.");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " mins");
        System.out.println("Bitrate: " + bitrate + " kbps");
        System.out.println("Artist: " + artistName);
    }
} //class audiofile ends here

class VideoFile extends MediaFile {
   
    String resolution;
    double frameRate;
    String directorName;

    VideoFile() { //default constructor
        super();
        resolution = "1080p";
        frameRate = 30.0;
        directorName = "Unknown Director";
    }
    // parameterized constructor
    VideoFile(String fileName, double fileSize, String format, String resolution, double frameRate, String directorName) {
        super(fileName, fileSize, format);
        this.resolution = resolution;
        this.frameRate = frameRate;
        this.directorName = directorName;
    }

    void playVideo() {
        System.out.println(" Playing video: " + fileName + " directed by " + directorName);
    }

    void adjustBrightness() {
        System.out.println(" Adjusting video brightness...");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution);
        System.out.println("Frame Rate: " + frameRate + " FPS");
        System.out.println("Director: " + directorName);
    }
}// class videofile ends here

class ImageFile extends MediaFile {
    String dimensions;
    int colorDepth;     
    String photographer;

    ImageFile() {
        super();
        dimensions = "1024x768";
        colorDepth = 24;
        photographer = "Unknown Photographer";
    }

    ImageFile(String fileName, double fileSize, String format, String dimensions, int colorDepth, String photographer) {
        super(fileName, fileSize, format);
        this.dimensions = dimensions;
        this.colorDepth = colorDepth;
        this.photographer = photographer;
    }

    void viewImage() {
        System.out.println(" Displaying image: " + fileName + " captured by " + photographer);
    }

    void applyFilter() {
        System.out.println(" Applying image filter...");
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Color Depth: " + colorDepth + "-bit");
        System.out.println("Photographer: " + photographer);
    }
}// class imagefile ends here


public class MediaTest {
    public static void main(String[] args) {

        System.out.println("----- Audio File Example -----");
        AudioFile a1 = new AudioFile("song.mp3", 5.2, "MP3", 4.1, 320, "Arijit Singh");
        a1.displayInfo();
        a1.playAudio();
        a1.pauseAudio();

        System.out.println("\n----- Video File Example -----");
        VideoFile v1 = new VideoFile("movie.mp4", 700.5, "MP4", "4K", 60.0, "Christopher Nolan");
        v1.displayInfo();
        v1.playVideo();
        v1.adjustBrightness();

        System.out.println("\n----- Image File Example -----");
        ImageFile i1 = new ImageFile("landscape.jpg", 2.5, "JPEG", "1920x1080", 32, "Steve McCurry");
        i1.displayInfo();
        i1.viewImage();
        i1.applyFilter();
    }
}
