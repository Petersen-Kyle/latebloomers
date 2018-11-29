/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.cityOfAaronLB.control;


import cit260.cityOfAaronLB.model.Tools;


/**
 *
 * @author kpetersen
 */
public class ToolSortControl {

    public static int[] doSort(int[] arr){
        int n = arr.length;
        int j;
        
        for (int i = 0; i < n -1; i++)
        {
            int index = i;
            for ( j = i +1; j < n; j++)
                if (arr[j] < arr[index])
                    index = j;
            int temp= arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }    
        
        return arr;
    }
    
    public void sortTools(){
        int[] tool = new int[4];
        
        tool[0] = Tools.hammer.getAdjustments();
        tool[1] = Tools.plow.getAdjustments();
        tool[2] = Tools.shovel.getAdjustments();
        tool[3] = Tools.sickle.getAdjustments();
        
        int[] arr1 = {tool[0], tool[1], tool[2], tool[3]};
        int[] arr2 = doSort(arr1);
        System.out.print("Possible bonus points from tools are: ");
        for(int i:arr2){
        System.out.print(i);
        System.out.print(", ");
    }
        System.out.print("\n");
    }

}
