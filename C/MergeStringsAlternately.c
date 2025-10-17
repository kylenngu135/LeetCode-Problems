char* mergeAlternately(char* word1, char* word2) {
    int size1 = strlen(word1), size2 = strlen(word2);
    bool flag = size1 > size2; 

    int i = 0, j = 0;

    char* result = malloc(sizeof(char) * (size1 + size2 + 1));

    int count = 0;
    
    

    while (i < size1 && j < size2) {
        *result = word1[i];

        result++;
        count++;
        i++;

        *result = word2[j];

        result++;
        count++;
        j++;
    }

    if (flag) {
        strcpy(result, word1 + (count / 2)); 
    } else if (size1 == size2) {
        *result = (char) 0;
    } else {
        strcpy(result, word2 + (count / 2));  
    }
    
    result -= count;

    return result;


}
