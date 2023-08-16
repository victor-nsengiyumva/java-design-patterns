public class Tekken {
    public static void main(String[] args) {
        System.out.println("Finnish him!");

        JumpBehaviour shortJump = new ShortJump();
        JumpBehaviour longjump = new LongJump();
        TornadoKick tornadoKick = new TornadoKick();
        LightningKick lightningKick = new LightningKick();

        Fighter paul = new Paul(tornadoKick, shortJump);

        paul.display();
        paul.punch();
        paul.kick();
        paul.jump();
        paul.setJumpStrategy(longjump);
        paul.setKickStrategy(lightningKick);
        paul.jump();
    }
}