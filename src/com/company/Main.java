package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] data = {-4, 11, 7, -12, 6, 1};
        boolean changed = true;
        int correct = 0; // how many are correct at the end
        while (changed == true)
        {
            changed = false;
            for (int i = 0; i < data.length - 1 - correct; i++)
            {
                if (data[i] > data[i + 1])
                {
                    swap(data, i, i + 1);
                    changed = true;
                }
            }
            for (int e : data)
                System.out.print(e + " ");
            System.out.println("");
            correct++;
        }
    }
    static void swap ( int[] array, int ind1, int ind2)
    {
        int tmp = array[ind2];
        array[ind2] = array[ind1];
        array[ind1] = tmp;
    }
}
