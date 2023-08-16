public interface KickBehaviour {
    public void kick();
}

 class LightningKick implements KickBehaviour {

    @Override
    public void kick() {
        System.out.println("This is a lightning kick");
    }

}

class TornadoKick implements KickBehaviour {
    @Override
    public void kick() {
        System.out.println("This is a Tornado kick");
    }
}