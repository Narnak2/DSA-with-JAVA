package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class NepaliCoins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,1000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int coutofCoins=0;
        int amount=508;
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i=0;i<coins.length;i++)
        {
            if (coins[i]<=amount) {
                while (coins[i] <= amount) {
                    coutofCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("totoal min coins used="+coutofCoins);
        for (int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
