public class Personaje {
    String name;
    String lastName;
    private int life;
    boolean isHeAlive = true;

    public void setearVida(int life){

        if (life < 0){
            this.life = 0;
        } else{
            this.life = life;
        }

    }

    public int verVida(){
        return this.life;
    }
}
