:-[forward,proof,bd],dynamic(fact/1).

%Base de conhecimento


if filme and antigo and guerra and aventura and suspense and alta then 'perfil1'.
if filme and recente and guerra and aventura and suspense and alta then 'perfil2'.
if filme and antigo and guerra and aventura and suspense and baixa then 'perfil3'.
if filme and recente and guerra and aventura and suspense and baixa then 'perfil4'.
if filme and antigo and drama and terror and alta then 'perfil5'.
if filme and antigo and drama and terror and baixa then 'perfil6'.
if filme and recente and drama and terror and alta then 'perfil7'.
if filme and recente and drama and terror and baixa then 'perfil8'.
if filme and antigo and comedia and ficcao and musical and alta then 'perfil9'.
if filme and antigo and comedia and ficcao and musical and baixa then 'perfil10'.
if filme and recente and comedia and ficcao and musical and alta then 'perfil11'.
if filme and recente and comedia and ficcao and musical and baixa then 'perfil12'.
if filme and antigo and animacao and alta then 'perfil13'.
if filme and recente and animacao and alta then 'perfil14'.
if serie and antigo and guerra and aventura and suspense and alta then 'perfil15'.
if serie and recente and guerra and aventura and suspense and alta then 'perfil16'.
if serie and recente and guerra and aventura and suspense and baixa then 'perfil17'.
if serie and antigo and drama and terror and baixa then 'perfil18'.
if serie and recente and drama and terror and alta then 'perfil19'.
if serie and recente and drama and terror and baixa then 'perfil20'.
if serie and antigo and comedia and ficcao and musical and alta then 'perfil21'.
if serie and antigo and comedia and ficcao and musical and baixa then 'perfil22'.
if serie and recente and comedia and ficcao and musical and alta then 'perfil23'.
if serie and recente and comedia and ficcao and musical and baixa then 'perfil24'.
if serie and antigo and animacao and alta then 'perfil25'.
if serie and recente and animacao and alta then 'perfil26'.
if serie and recente and animacao and baixa then 'perfil27'.
if filme and antigo and animacao and baixa then 'naoha'.
if filme and recente and animacao and baixa then 'naoha'.
if serie and antigo and guerra and aventura and suspense then 'naoha'.
if serie and antigo and drama and terror and alta then 'naoha'.
if serie and antigo and animacao and baixa then 'naoha'.
if serie and antigo and drama and baixa then 'naoha'.
if filme and recente and guerra and aventura and accao and drama and biografia and alta then 'naoha'.
if filme and antigo and aventura and drama and crime and thriller and biografia and alta then 'naoha'.
if filme and recente and guerra and aventura and accao and drama and crime and thriller and alta then 'naoha'.
if filme and recente and guerra and aventura and accao and terror and drama and baixa then 'naoha'.
if filme and recente and guerra and aventura and accao and terror and drama and alta then 'naoha'.




respostas(X):- fact(Perfil), solucao(Perfil,X,_,_,_,_).
respostas(_).

obtem(P):- demo, findall(A,respostas(A),L1), list_to_set(L1,P).




























