#include <iostream>
using namespace std;


void swap(int a[], int x, int y) {
    int temp = a[x];
    a[x] = a[y];
    a[y] = temp;
}

int locOfSmallest(int a[], int s, int e) {
    int i = s;
    int j = i;
    while (i <= e) {
        if (a[i] < a[j]) {
            /* code */
        }
        
    }
    
}

void selSort(int a[], int n) {
    int i = 0;
    while (i < n - 1) {
        int j = locOfSmallest(a, i, n - 1);
        swap(a, i, j);
        i++;
    }
    
}

int main() {
    int a = {10 20 20 50}
    return 0;
}