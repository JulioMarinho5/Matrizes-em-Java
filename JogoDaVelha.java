	char a[][] = new char[3][3];
		int i = 0, j = 0, k = 0;
		int opclinha, opccoluna, fim, invalido, empate;
		do {
			for (i = 0; i < 3; i++) {
				for (j = 0; j < 3; j++) {
					a[i][j] = '-';
				}
			}
			empate = 0;
			System.out.println("Vamos começar o jogo!");
			for (k = 0; k < 9; k++) {
				invalido = 0;
				boolean nãorepetir = false;
				if (k % 2 == 0) {
					System.out.println("Agora é a vez do X | Escolha a linha e coluna que deseja inserir (3x3).");
				} else {
					System.out.println("Agora é a vez da O | Escolha a linha e coluna que deseja inserir (3x3).");
				}
				System.out.println("Número da linha:");
				opclinha = scanner.nextInt();
				System.out.println("Número da coluna:");
				opccoluna = scanner.nextInt();
				if ((opclinha < 0) || (opclinha > 3) || (opccoluna < 0) || (opccoluna > 3)) {
					System.out.println("Número de linhas ou colunas invalido. Tente novamente");
					invalido++;
					k--;
				}
				if (invalido == 0) {
					if ((a[opclinha - 1][opccoluna - 1] == 'X') || (a[opclinha - 1][opccoluna - 1] == 'O')) {
						System.out.println(
								"***Essa posição já foi escolhida anteriormente. Tente escolher outra posição.***");
						k--;
						nãorepetir = true;
					}
					for (i = 0; i < 3; i++) {
						for (j = 0; j < 3; j++) {
							if (a[i][j] != '-') {
								empate++;
							}
						}
					}
					for (i = 0; i < 3; i++) {
						for (j = 0; j < 3; j++) {
							if (nãorepetir == false) {
								if (k % 2 == 0) {
									a[opclinha - 1][opccoluna - 1] = 'X';
								} else {
									a[opclinha - 1][opccoluna - 1] = 'O';
								}
							}
							System.out.print(a[i][j] + " ");
						}
						System.out.println();
					}
					for (int x = 0; x < 3; x++) {
						if ((a[x][0] == 'X') && (a[x][1] == 'X') && (a[x][2] == 'X')) {
							System.out.println("Parabéns!!! 'X' é o vencedor ");
							k = 9;
						} else {
							if ((a[x][0] == 'O') && (a[x][1] == 'O') && (a[x][2] == 'O')) {
								System.out.println("Parabéns!!! 'O' é o vencedor ");
								k = 9;
							}
						}
					}
					for (int x = 0; x < 3; x++) {
						if ((a[0][x] == 'X') && (a[1][x] == 'X') && (a[2][x] == 'X')) {
							System.out.println("Parabéns!!! 'X' é o vencedor ");
							k = 9;
						} else {
							if ((a[0][x] == 'O') && (a[1][x] == 'O') && (a[2][x] == 'O')) {
								System.out.println("Parabéns!!! 'O' é o vencedor ");
								k = 9;
							}
						}
					}
					if ((a[0][0] == 'X') && (a[1][1] == 'X') && (a[2][2] == 'X')) {
						System.out.println("Parabéns!!! 'X' é o vencedor ");
						k = 9;
					} else {
						if ((a[0][0] == 'O') && (a[1][1] == 'O') && (a[2][2] == 'O')) {
							System.out.println("Parabéns!!! 'O' é o vencedor ");
							k = 9;
						}
					}
					if ((a[0][2] == 'X') && (a[1][1] == 'X') && (a[2][0] == 'X')) {
						System.out.println("Parabéns!!! 'X' é o vencedor ");
						k = 9;
					} else {
						if ((a[0][2] == 'O') && (a[1][1] == 'O') && (a[2][0] == 'O')) {
							System.out.println("Parabéns!!! 'O' é o vencedor ");
							k = 9;
						} else {
							if (empate == 45) {
								System.out.println("O jogo terminou em empate!");
							}
						}
					}
				}
			}
			System.out.println("Deseja iniciar outra rodada?");
			System.out.println("1) SIM/ 2) NÂO");
			k = 0;
			fim = scanner.nextInt();
		} while (fim <= 1);
		System.out.println("Game over");
