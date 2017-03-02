/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StateDemo
{
    public static void main(String[] args)
    {
        ceilingFan.CeilingFanPullChain chain = new ceilingFan.CeilingFanPullChain();
        while (true)
        {
            System.out.print("Press ");
            get_line();
            chain.pull();
        }
    }
    static String get_line()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in))
          ;
        String line = null;
        try
        {
            line = in.readLine();
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
        return line;
    }
}