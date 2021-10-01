public class TV {
    int channel, volumeLevel;
    boolean isOn;

    public TV()
    {
        channel = 1;
        volumeLevel = 1;
        isOn = false;
    }

    public void turnOn()
    {
        isOn = true;
    }

    public void turnOff()
    {
        isOn = false;
    }

    public void setChannel(int channel)
    {
        if(channel < 1 || channel > 120)
        {
            return;
        }
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel)
    {
        if(volumeLevel < 0 || volumeLevel > 7)
        {
            return;
        }
        this.volumeLevel = volumeLevel;
    }

    public void channelUp()
    {
        ++ channel;
        channel %= 120;
        channel = channel == 0 ? 120 : channel;
    }

    public void channelDown()
    {
        channel = (channel + 119) % 120 == 0 ? 120 : (channel + 119) % 120;
    }

    public void volumeUp()
    {
        volumeLevel = volumeLevel > 6 ? volumeLevel : volumeLevel + 1;
    }

    public void volumeDown()
    {
        volumeLevel = volumeLevel < 1 ? volumeLevel : volumeLevel - 1;
    }
}
