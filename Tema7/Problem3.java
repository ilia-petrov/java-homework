public class Problem3 {
    public static void main(String[] args)
    {
        TV tv = new TV();

        tv.setChannel(130);
        tv.channelDown();
        System.out.println(tv.channel);
        tv.setChannel(10);
        tv.setVolumeLevel(13);
        tv.volumeDown();
        tv.volumeDown();
        System.out.println(tv.volumeLevel);
        tv.volumeUp();
        System.out.println(tv.volumeLevel);
    }
}
