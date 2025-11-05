package intefaces.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Taking photo with smartphone");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking video with smartphone");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing Music on smartphone");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music on smartphone");
    }

    @Override
    public void makeCall(String number) {

    }

    @Override
    public void endCall() {

    }
}
