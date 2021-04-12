public class TvAndTvController {

    public String tvController;
    public String setTvController;
    public int currentChannel;
    public int currentVolume;


    public TvAndTvController(String manufacturer){
        manufacturer = manufacturer;
    }

    public boolean tvOn;
    public void tvOn() {
        this.tvOn = true;
    }
    public void tvOff() {
        this.tvOn = false;
    }

    public int addVolume(int volume){
        this.currentVolume += volume;
        return this.currentVolume;
    }
    public int minusVolume(int volume) {
        this.currentVolume -= volume;
        return this.currentVolume;
    }

    public int addChannel(int channel){
        this.currentChannel += channel;
        return this.currentChannel;
    }
    public int minusChannel(int channel) {
        this.currentChannel -= channel;
        return this.currentChannel;
    }

    public boolean setTvController() {
        return false;
    }
}
