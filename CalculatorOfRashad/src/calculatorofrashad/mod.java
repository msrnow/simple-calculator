/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorofrashad;

/**
 *
 * @author pc
 */
public class mod implements Strategy{
    public int doOperation(int p1, int p2)
    {
        return p2%p1;
    }
}