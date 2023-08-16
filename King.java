public class King extends Fighter {

    public King(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    
    @Override
    public void display(){
        System.out.println("HI, i am king");
    }

    @Override
    public void roll(){
        
    }
}
