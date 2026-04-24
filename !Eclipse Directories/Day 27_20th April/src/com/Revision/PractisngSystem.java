package com.Revision;

class GatewaySystem {
	void impementingGateways(String gatewayName, int gatewayAmount) {
		System.out.println("Printing GatewaySystem.implementingGateways");
	}
}

class GatewayIntegration extends GatewaySystem

{
	@Override
	protected void impementingGateways(String gatewayName, int gatewayAmount) {
		System.out.println("Printing GatewayIntegration.child class");
	}
}

public class PractisngSystem {

}
