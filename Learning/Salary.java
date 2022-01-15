package Learning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Salary {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter your monthly salary");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=Integer.parseInt(br.readLine());
        int annuals=s*12;
        if(s<100000) {
            annuals += 0.15 * annuals;
        }else if(s>100000&&s<200000)
        {
            annuals += 0.1 * annuals;
        }else if(s>200000)
        {
            annuals += 0.5 * annuals;
        }
        System.out.println("Annual Salary is "+annuals);
    }
}
