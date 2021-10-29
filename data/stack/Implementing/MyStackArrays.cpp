/*
C++ program to implement basic stack 
operations 
*/

#include <bits/stdc++.h>

using namespace std;

#define MAX 1000;

class Stack {
    int top;

public:
    int a[MAX];

    Stack() { top = -1; }
    bool push(int x);
    int pop();
    int peek();
    bool isEmpty();
};

bool Stack::push(int x) {
    if (top >= (MAX - 1)) {
        cout << "Stack Overflow";
        return false;
    } else {
        a[++top] = x;
        cout << x << " pushed into stack\n";
        return true;
    }
}

int Stack::peek() {
    
}