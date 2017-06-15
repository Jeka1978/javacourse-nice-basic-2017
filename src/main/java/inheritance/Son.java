package inheritance;

/**
 * Created by Evegeny on 15/06/2017.
 */
public class Son extends Father {


    public Son() {
      super(23);
    }

    @Override
    public int getAge() {

        return super.getAge()*2;
    }


}
