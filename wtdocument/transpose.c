#include <stdio.h>
int main() {
  int r, c,i,j;
  printf("Enter rows and columns: ");
  scanf("%d %d", &r, &c);
  int a[r][c], t[c][r];
    printf("\nEnter matrix elements:\n");
for(i = 0; i < r; i++)
  for(j = 0; j < c; j++) {
       scanf("%d", &a[i][j]);
  }
  printf("\nEntered matrix: \n");
  for(i = 0; i < r; i++)
  {
  for(j = 0; j < c; j++) {
    printf("%d  ", a[i][j]);
}

    printf("\n");
  }

  for(i = 0; i < r; i++)
  {
  for(j = 0; j < c; j++) {
    t[j][i] = a[i][j];
  }
}
   printf("\nTranspose :\n");
  for(i = 0; i < c; i++)
  {
    for(j = 0; j < r; j++) {
    printf("%d  ", t[i][j]);
    }
  printf("\n");
}
  return 0;
}

