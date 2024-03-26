#include <stdio.h>
#include <stdlib.h>

//<prototipos>
int miner(unsigned long long start, unsigned long long *bloco);
void stock(unsigned long long new_primo, FILE *src, unsigned long long *bloco, unsigned long long *max);

int main(void) {
  // <variaveis>
    unsigned int contador = 0, limiter = 0;
  unsigned long long gen, next_primo;
  unsigned long long max = 0;
  unsigned long long *bloco = calloc(800000, sizeof(unsigned long long));
  // 80.000.000 80M de 8 bytes
  // FILE
  FILE *primo_db;


  
  // loading do bloco
  primo_db = fopen("primos.txt", "a+");
  while(fscanf(primo_db, "%llu", (bloco + max)) > 0){
   // printf("\nindice %llu \t valor %llu",max, *(bloco + max));
    max++;
  }
  max--; //evita o erro de um indice com 0 a mais.
  fclose(primo_db);
  gen = *(bloco + max);



  // mine

  do {
    gen++;
    
    if (miner(gen, bloco)) {
    limiter++;
      
      primo_db = fopen("primos.txt", "a+");
      stock(gen, primo_db, bloco, &max);
      fclose(primo_db);


      if(limiter == 1000){
        limiter = 0;
        contador++;
      printf("\num bloco de 1.000 novos primos minerados\narmazenados em %llu \t %d blocos minerados\n",max,contador);
        }
    }
  } while (max < 80000000); // limite do meu calloc
}

//<loading>


//<miner>
int miner(unsigned long long start, unsigned long long *bloco) {
  int truly = 1; // todo numero é primo até que se prove o contrario kkkk;
  for (unsigned long long n = 0; *(bloco + n) <= start / 2; n++) {
    if (start % *(bloco + n) == 0) {
      truly = 0;
      break;
    }
  }
      return truly;
}

//<stock>

void stock(unsigned long long new_primo, FILE *src, unsigned long long *bloco, unsigned long long *max) {
  fprintf(src, "%llu\n", new_primo);
  *max = *max + 1;
  unsigned long long temp = *max;
  *(bloco + temp) = new_primo;
}
