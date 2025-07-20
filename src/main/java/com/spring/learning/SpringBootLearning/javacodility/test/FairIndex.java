package com.spring.learning.SpringBootLearning.javacodility.test;

public class FairIndex {

    public static int fairIndexTest(int a[], int []b){
        int fairIndex =0;
        int N=a.length;
        for(int k=1;k<N;k++){
            int sumA1=0;
            int sumA2=0;
            int sumB1=0;
            int sumB2=0;

            for(int i=0;i<k;i++){
                sumA1 = sumA1 + a[i];
                sumB1 = sumB1 + b[i];
            }

            for(int i=k;i<N;i++){
                sumA2 = sumA2 + a[i];
                sumB2 = sumB2 + b[i];
            }

            if(sumA1 == sumA2 && sumB1 == sumB2 && sumA1 == sumB1){
                fairIndex =  fairIndex + 1;
            }
        }
        return  fairIndex;
    }

    public static void main(String[] args) {
        /*int a[] ={0,4,-1,0,3};
        int b[]={0,-2,5,0,3};*/
        /*int a[]={2,-2,-3,3};
        int b[]={0,0,4,-4};*/
      /*  int a[]={4,-1,0,3};
        int b[]={-2,6,0,4};*/
        int a[]={3,2,6};
        int b[]={4,1,6};
        System.out.println("check the fairIndex :: "+fairIndexTest(a,b));
    }
}
