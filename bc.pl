:- dynamic (fact/1).
:- [backward, forward, bd, proof].

%% regras: base de conhecimento - series
if (serie or indiferente) and (acao or drama or historia or genero_indiferente) then 'Irmãos_de_Armas'.
if (serie or indiferente) and (animacao or acao or aventura or genero_indiferente) then 'Avatar__A_Lenda_de_Aang'.
if (serie or indiferente) and (animacao or aventura or comedia or genero_indiferente) then 'Rick_And_Morty'.
if (serie or indiferente) and (aventura or drama or fantasia or genero_indiferente) then 'Game_of_Thrones'.
if (serie or indiferente) and (biografia or drama or historia or genero_indiferente) then 'When_They_See_Us'.
if (serie or indiferente) and (biografia or crime or drama or genero_indiferente) then 'Narcos'.
if (serie or indiferente) and (comedia or fantasia or genero_indiferente) then 'The_Filthy_Frank_Show'.
if (serie or indiferente) and (crime or drama or thriller or genero_indiferente) then 'Breaking_Bad'.
if (serie or indiferente) and (desporto or documentario or genero_indiferente) then 'Até_o_Fim__Flamengo_Campeão_da_Libertadores_2019'.
if (serie or indiferente) and (documentario or genero_indiferente) then 'Planeta_Terra_2'.
if (serie or indiferente) and (acao or drama or ficcaoCientifica or genero_indiferente) then 'Firefly'.
if (serie or indiferente) and (acao or ficcaoCientifica or thriller or genero_indiferente) then 'Black_Mirror'.
if (serie or indiferente) and (documentario or guerra or historia or genero_indiferente) then 'The_Vietnam_War'.
if (serie or indiferente) and (drama or guerra or genero_indiferente) then 'Das_Boot'.
if (serie or indiferente) and (crime or drama or misterio or genero_indiferente) then 'Sahsiyet'.
if (serie or indiferente) and (aventura or comedia or misterio or genero_indiferente) then 'Los_Simuladores'.
if (serie or indiferente) and (drama or genero_indiferente) then 'Pose'.
if (serie or indiferente) and (documentario or musica or genero_indiferente) then 'Hip__Hop_Evolution'.
if (serie or indiferente) and (realitytv or genero_indiferente) then 'Car_Masters:_Rust_to_Riches'.
if (serie or indiferente) and (drama or religiao or genero_indiferente) then 'Francisco_el_Jesuita'.
if (serie or indiferente) and (comedia or crime or genero_indiferente) then 'Snatch'.
if (serie or indiferente) and (talkshow or genero_indiferente) then 'Top_Gear'.
if (serie or indiferente) and (drama or fantasia or horror or genero_indiferente) then 'The_Twilight_Zone'.
if (serie or indiferente) and (acao or drama or comedia or genero_indiferente) then 'The_Family_Man'.
if (serie or indiferente) and (documentario or genero_indiferente) then 'Blue_Planet_II'.
if (serie or indiferente) and (crime or drama or thriller or genero_indiferente) then 'The_Wire'.
if (serie or indiferente) and (acao or comedia or crime or genero_indiferente) then 'The_Boys'.
if (serie or indiferente) and (documentario or genero_indiferente) then 'Our_Planet'.
if (serie or indiferente) and (crime or acao or aventura or genero_indiferente) then 'O_Justiceiro'. 
if (serie or indiferente) and (crime or drama or genero_indiferente) then 'The_Sopranos'. 
if (serie or indiferente) and (documentario or historia or guerra or genero_indiferente) then 'The_World_at_War'.
if (serie or indiferente) and (comedia or talkshow or genero_indiferente) then 'Meme_Review'.
if (serie or indiferente) and (crime or drama or misterio or genero_indiferente) then 'Sherlock'.
if (serie or indiferente) and (documentario or desporto or genero_indiferente) then 'Formula_1_Drive_to_Survive'.
if (serie or indiferente) and (animacao or acao or aventura or genero_indiferente) then 'Hangane_no_renkinjutsushi'. 
if (serie or indiferente) and (documentario or musica or genero_indiferente) then 'The_Beatles_Anthology'.
if (serie or indiferente) and (crime or drama or genero_indiferente) then 'Unbelievable'. 
if (serie or indiferente) and (animacao or acao or aventura or genero_indiferente) then 'Batman_The_Animated_Series'.
if (serie or indiferente) and (drama or genero_indiferente) then 'Dekalog'. 
if (serie or indiferente) and (crime or drama or misterio or genero_indiferente) then 'True_Detective'.
if (serie or indiferente) and (documentario or historia or guerra or genero_indiferente) then 'The_Civil_War'.
if (serie or indiferente) and (animacao or crime or drama or genero_indiferente) then 'Death_Note'.
if (serie or indiferente) and (crime or drama or thriller or genero_indiferente) then 'Fargo'.
if (serie or indiferente) and (animacao or acao or aventura or genero_indiferente) then 'Kaubôi_bibappu'.
if (serie or indiferente) and (documentario or genero_indiferente) then 'Africa'.
if (serie or indiferente) and (comedia or genero_indiferente) then 'Only_Fools_and_Horses'.
if (serie or indiferente) and (comedia or genero_indiferente) then 'The_Office'.
if (serie or indiferente) and (acao or aventura or ficcaoCientifica or genero_indiferente) then 'The_Mandalorian'.



% regras: base de conhecimento - filmes
if (filme or indiferente) and (acao or crime or drama or genero_indiferente) then 'Batman_Cavaleiro_das_Trevas'.
if (filme or indiferente) and (acao or ficcaoCientifica or misterio or genero_indiferente) then 'A_Origem'.
if (filme or indiferente) and (acao or drama or historia or genero_indiferente) then 'Harakiri'.
if (filme or indiferente) and (animacao or aventura or drama or genero_indiferente) then 'O_Rei_Leao'.
if (filme or indiferente) and (animacao or aventura or familia or genero_indiferente) then 'Wall_E'.
if (filme or indiferente) and (animacao or aventura or comedia or familia or genero_indiferente) then 'Coco'.
if (filme or indiferente) and (animes or aventura or familia or genero_indiferente) then 'A_Viagem_de_Chihiro'.
if (filme or indiferente) and (animes or drama or guerra or genero_indiferente) then 'O_Tumulo_dos_Pirilampos'.
if (filme or indiferente) and (animes or drama or fantasia or genero_indiferente) then 'Your_Name'.
if (filme or indiferente) and (aventura or fantasia or genero_indiferente) then 'O_Senhor_dos_Aneis__O_Regresso_do_Rei'.
if (filme or indiferente) and (aventura or drama or guerra or genero_indiferente) then 'Montanha_II'.
if (filme or indiferente) and (aventura or fantasia or genero_indiferente) then 'Star_Wars_Episodio_5__O_Imperio_Contra_Ataca'.
if (filme or indiferente) and (biografia or drama or historia or genero_indiferente) then 'Lista_de_Schindler'.
if (filme or indiferente) and (biografia or crime or drama or genero_indiferente) then 'Tudo_Bons_Rapazes'.
if (filme or indiferente) and (biografia or drama or guerra or genero_indiferente) then 'O_Pianista'.
if (filme or indiferente) and (comedia or genero_indiferente) then 'Gato_Fedorento__Serie_Fonseca'.
if (filme or indiferente) and (comedia or drama or romance or genero_indiferente) then 'A_Vida_e_Bela'.
if (filme or indiferente) and (comedia or drama or thriller or genero_indiferente) then 'Parasite'.
if (filme or indiferente) and (crime or drama or genero_indiferente) then 'Os_Condenados_de_Shawshank'.
if (filme or indiferente) and (crime or drama or genero_indiferente) then 'O_Padrinho'.
if (filme or indiferente) and (curtasMetragens or ficcaoCientifica or genero_indiferente) then 'Vader_A_Star_Wars_Theory_Fan_Film'.
if (filme or indiferente) and (animacao or curtasMetragens or familia or genero_indiferente) then 'Piper'.
if (filme or indiferente) and (desporto or drama or genero_indiferente) then 'Yeh_Ballet'.
if (filme or indiferente) and (curtasMetragens or desporto or documentario or genero_indiferente) then 'Learning_to_Skateboard_in_a_Warzone__If_Youre_a_Girl'.
if (filme or indiferente) and (documentario or drama or guerra or genero_indiferente) then 'Seven_Days_in_Syria'.
if (filme or indiferente) and (documentario or terror or genero_indiferente) then 'Earthlings'.
if (filme or indiferente) and (drama or genero_indiferente) then 'Wheels'.
if (filme or indiferente) and (crime or drama or genero_indiferente) then 'O_Padrinho_Parte_II'.
if (filme or indiferente) and (drama or familia or genero_indiferente) then 'Como_Estrelas_na_Terra'.
if (filme or indiferente) and (documentario or familia or genero_indiferente) then 'Os_Ultimos_Leoes'.
if (filme or indiferente) and (comedia or drama or fantasia or genero_indiferente) then 'A_espera_de_um_milagre'.
if (filme or indiferente) and (faroeste or genero_indiferente) then 'O_Bom_o_Mau_e_o_Vilao'.
if (filme or indiferente) and (faroeste  or indiferente)then 'Aconteceu_no_Oeste'.
if (filme or indiferente) and (acao or ficcaocientifica or genero_indiferente) then 'Matrix'.
if (filme or indiferente) and (documentario or guerra or genero_indiferente) then 'Para_Sama'.
if (filme or indiferente) and (drama or guerra or genero_indiferente) then 'O_pianista'.
if (filme or indiferente) and (crime or drama or historia or genero_indiferente) then 'America_Proibida'.
if (filme or indiferente) and (biografia or drama or historia or genero_indiferente) then 'Amadeus'.
if (filme or indiferente) and (documentario or lgbti or genero_indiferente) then 'Paris_is_Burning'.
if (filme or indiferente) and (biografia or romance or lgbti or genero_indiferente) then 'Oracoes_para_Bobby'.
if (filme or indiferente) and (crime or drama or misterio or genero_indiferente) then 'Seven_7_Pecados_Mortais'.
if (filme or indiferente) and (misterio or terror or thriller or genero_indiferente) then 'Psicose'.
if (filme or indiferente) and (musica or genero_indiferente) then 'Florence_the_Machine_The_Odyssey'.
if (filme or indiferente) and (musica or drama or genero_indiferente) then 'The_Phantom_of_the_Opera_at_the_Royal_Albert_Hall'.
if (filme or indiferente) and (natal or fantasia or drama or genero_indiferente) then 'Do_Ceu_Caiu_Uma_Estrela'.
if (filme or indiferente) and (animacao or comedia or natal or genero_indiferente) then 'Feliz_Natal_Charlie_Brown'.
if (filme or indiferente) and (drama or policial or genero_indiferente) then 'Crepusculo_dos_Deuses'.
if (filme or indiferente) and (crime or drama or policial or genero_indiferente) then 'Pagos_a_Dobrar'.
if (filme or indiferente) and (aventura or drama or religiao or genero_indiferente) then 'Os_Dez_Moramentos'.
if (filme or indiferente) and (drama or religiao or genero_indiferente) then 'A_Ultima_Tentacao_de_Cristo'.
if (filme or indiferente) and (drama or romance or genero_indiferente) then 'Forrest_Gump'.
if (filme or indiferente) and (comedia or drama or romance or genero_indiferente) then 'Tempos_Modernos'.
if (filme or indiferente) and (comedia or standup or genero_indiferente) then 'Hasan_Minhaj_Homecoming_King'.
if (filme or indiferente) and (comedia or standup or genero_indiferente) then 'Hannah_Gadsby_Nanette'.
if (filme or indiferente) and (misterio or suspense or thriller or genero_indiferente) then 'Estrada_Perdida'.
if (filme or indiferente) and (drama or suspense or thriller or genero_indiferente) then 'Desligados'.
if (filme or indiferente) and (drama or terror or genero_indiferente) then 'O_Iluminado'.
if (filme or indiferente) and (ficcao_cientifica or terror or genero_indiferente) then 'Alien_o_Oitavo_Passageiro'.
if (filme or indiferente) and (acao or crime or thriller or genero_indiferente) then 'Vikram_Vedha'.
if (filme or indiferente) and (crime or drama or thriller or genero_indiferente) then 'Hannibal_O_Silencio_dos_Inocentes'.

respostas(A):- fact(X), solucao(X,A).
respostas(_).

obtem(P):- demo, findall(A,respostas(A),L1), list_to_set(L1,P).