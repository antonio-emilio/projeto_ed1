/*
 ============================================================================
 Nome dos integrantes: MELYSSA MARIANA GOMES SILVA E ANTONIO EMILIO PEREIRA
 Nome do projeto: iFound
 Versão: 1.0
 Descrição: Software para organização de estoque de componentes eletrônicos
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
#include "globaldef.h"

//MENU
int main()
{

    for (;;)
    {
        printf("\n");
        printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~iFound~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("* Sistema de gerenciamento de estoque para componentes eletronicos *\n");
        printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        printf("|Digite um numero para executar uma acao:                         |\n");
        printf("|1. Cadastrar um componente;                                      |\n");
        printf("|2. Encontrar componentes;                                        |\n");
        printf("|3. Cadastrar um projeto;                                         |\n");
        printf("|4. Imprimir ordem de producao;                                   |\n");
        printf("|5. Cadastrar categorias;                                         |\n");
        printf("|6. Baixa de estoque;                                             |\n");
        printf("|6. Relação de componentes;                                       |\n");
        printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        scanf("%d",&escolha);

    }
    return 0;
}
