package com.StructuralPattern.BridgePattern;

import java.util.List;

public interface Formatter {
	public String format(String header, List<Details> details);
}
