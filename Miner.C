#include <stdio.h>

// fread e fprintf

int main(void) {
  unsigned long int fuck = 4294967295;
  unsigned long int primos[1000000];
  {
    primos[0] = 2;
    primos[1] = 3;
    primos[2] = 5;
    primos[3] = 7;
    primos[4] = 11;
  }
  unsigned long int gen = 12;
  int truly;
  float cache;
  int count = 4;
  int dis = 0;

  do {
    truly = 1;
    for (unsigned long int n = 0; primos[n] < gen / 2; n++) {
      cache = gen % primos[n];
      if (cache == 0) {
        truly = 0;
        break;
      }
    }
    if (truly == 1) {
      count++;
      primos[count] = gen;
      printf("\n%ld e primo   dis: %d   armazenado em primo[%d]", gen, dis,
             count);
      dis = 0;
    } else
      dis++;
    gen++;

  } while (1);
}