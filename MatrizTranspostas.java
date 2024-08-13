		int a[][] = new int[3][2];
		int b[][] = new int[2][3];
		int linhas = 3, colunas = 2;
		int i, j;
		System.out.println("Insira 6 números inteiros e postitivos:");
		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Sua matriz:");
		for (i = 0; i < linhas; i++) {
			for (j = 0; j < colunas; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sua matriz TRANSPOSTA:");
		for (i = 0; i < 2 ; i ++) {
			for (j = 0; j < 3 ; j++) {
				b[i][j]= a[j][i];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
