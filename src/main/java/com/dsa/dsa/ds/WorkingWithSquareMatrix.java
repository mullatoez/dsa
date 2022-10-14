package com.dsa.dsa.ds;

public class WorkingWithSquareMatrix {
    public static void main(String[] args) {
       /* int arrCount = arr.size() + 1;

        int dimensionLength = (int) Math.sqrt(arrCount);

        //right side diagonal
        // [0,0], [1,1], [2,2] ...
        List<Integer> rightSide = new ArrayList<>();
        int rightSum = 0;
        for(int i = 0; i <= dimensionLength; i++){
            rightSide.add(arr.get(i).get(i));
        }

        for(int k = 0; k < rightSide.size(); k++){
            rightSum += rightSide.get(k);
        }

        //left diagonal
        //[0,3], [1,2], [2,1]

        int leftCoordinate = 0;
        int rightCoordinate = (int) dimensionLength;
        List<Integer> leftSide = new ArrayList<>();

        for(int j = 0; j <= dimensionLength; j++){
            leftSide.add(arr.get(j).get(rightCoordinate));
            rightCoordinate--;
        }

        int leftSum = 0;

        for(int z = 0; z < leftSide.size(); z++){
            leftSum += leftSide.get(z);
        }

        int v = leftSum - rightSum;
        return Math.abs(v);*/
    }
}

/*
*  int rightToLeftSum = 0;
    int leftToRightSum = 0;

    for(int  i = 0; i < arr.size(); i++){
        for(int j = 0; j < arr.get(i).size();j++){
            if(i == j){
                rightToLeftSum += arr.get(i).get(j);
            }

            if((i + j) == (arr.size() - 1)){
                leftToRightSum += arr.get(i).get(j);
            }
        }
    }

    return (rightToLeftSum > leftToRightSum) ? rightToLeftSum - leftToRightSum : leftToRightSum - rightToLeftSum;

    }
*/
