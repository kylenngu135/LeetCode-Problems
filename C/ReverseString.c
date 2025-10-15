void reverseString(char* s, int sSize) {
    int i = 0; 
    sSize -= 1;

    while (i < sSize) {
        char temp = s[sSize];
        s[sSize] = s[i];
        s[i] = temp;
        i++;
        sSize--;
    }
}
