typedef struct {
    char par[8400];
    int size;
} Stack;

bool isValid(char* s) {
    Stack paren;
    paren.size = 0;

    int size = strlen(s);

    for (int i = 0; i < size; i++) {
        bool check = s[i] == '(' || s[i] == '[' || s[i] == '{';

        if (check) {
            paren.par[paren.size] = s[i];
            paren.size++;
        } else if (paren.size == 0) {
            return false;
        } else {

            char t = paren.par[paren.size - 1];

            if ((t == '(') && (s[i] == ')')) {
                paren.size--;
            } else if (t == '[' && s[i] == ']') {
                paren.size--;
            } else if (t == '{' && s[i] == '}') {
                paren.size--;
            } else {
                return false;
            }
        }

    }

    return paren.size == 0;
}
