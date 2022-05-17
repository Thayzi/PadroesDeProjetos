package Dio.gof;

import Dio.gof.facade.Facade;
import Dio.gof.singleton.SingletonEager;
import Dio.gof.singleton.SingletonLazy;
import Dio.gof.singleton.SingletonLazyHolder;
import Dio.gof.strategy.Comportamento;
import Dio.gof.strategy.ComportamentoAgressivo;
import Dio.gof.strategy.ComportamentoDefensivo;
import Dio.gof.strategy.ComportamentoNormal;
import Dio.gof.strategy.Robo;


public class Teste {

	public static void main(String[] args) {
		
		//Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		
		//Strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Thayzi", "0000000");
	}
}
