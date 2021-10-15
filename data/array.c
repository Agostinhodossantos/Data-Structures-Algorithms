#include <stdio.h>

int LA[] = {1,3,5,7,8};
int item = 10, k = 3, n = 5;
int i = 0, j = 5;

void add() {
   n = n + 1;
   while (j >= k) {
       LA[j+1] = LA[j];
       j = j - 1;
   }

   LA[k] = item;
}


void delete() {
    j = k;

    while ( j < n) {
        LA[j - 1] = LA[j];
        j = j + 1;
    }

    n = n - 1;
    
}

int find(int item) {
    while (j < n) {
        if (LA[i] == item) {
            break;
        }

        j = j + 1;
    }
    return LA[i];
}

void update() {
    LA[k-1] = item;
}

main() {
  add();
  int f = find(2);
  printf("FIND[%d]", f);

//   for ( i = 0; i < n; i++)
//   {
//    printf("LA[%d] = %d \n", i, LA[i]);
//   }
  
}