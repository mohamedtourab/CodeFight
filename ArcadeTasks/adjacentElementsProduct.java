int adjacentElementsProduct(int[] inputArray) {
int max=-99999999;   
for(int i=0;i<inputArray.length-1;i++)
{
    if(inputArray[i]*inputArray[i+1]>max)
        max=inputArray[i]*inputArray[i+1];
}
    return max;
}
