class Swap2Nib {
    public static void main(String arg[]) {
        int x = 1962;
        int ans = (x & 0x0F) << 4 | (x & 0xF0) >> 4; // 0x0F=15; 0xF0=240;
        System.out.println(ans);
    }
}
