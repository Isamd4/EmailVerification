
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad Isa H
 */
public class CreateRandom {
    int length;
   public CreateRandom(int length){
        this.length=length;
    }
    public String getRand(){
        System.out.println("Generating OTP using random() : ");
        System.out.print("You OTP is : ");
        Random rand = new Random(this.length);
        String rands=rand.toString();
        String r=rands.substring(rands.indexOf('@')+1);
        return r;
    }
}
