public class Fighter{

    private KickBehaviour kickBehaviour;
    private JumpBehaviour jumpBehaviour;

    public Fighter( KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour){
                this.jumpBehaviour = jumpBehaviour;
                this.kickBehaviour = kickBehaviour;
    }

    public void setKickStrategy(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }

    public void setJumpStrategy(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public void kick(){
        kickBehaviour.kick();
    }

    public void jump(){
        jumpBehaviour.jump();
    }

    public void display(){};

    public void roll(){
         System.out.println("Roll");
    }

    public void punch(){
        System.out.println("Nice punch");
    }
}