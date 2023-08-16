public interface JumpBehaviour {
    public void jump();
}


class LongJump implements JumpBehaviour{
    @Override
    public void jump(){
        System.out.println("This is a long Jump");
    }
}

class ShortJump implements JumpBehaviour{
    @Override
    public void jump(){
        System.out.println("This is a Short Jump");
    }
}