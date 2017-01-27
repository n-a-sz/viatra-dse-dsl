package org.eclipse.viatra.dse.dsl.generator;

import static com.google.common.collect.Sets.newHashSet;

import java.util.Set;

import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;

public class DseOutputConfigurationProvider implements IOutputConfigurationProvider{

	
	public static final String GEN_ONCE_OUTPUT = "gen-once";
	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {
		// TODO Auto-generated method stub
		OutputConfiguration defaultOutPut = new OutputConfiguration(IFileSystemAccess.DEFAULT_OUTPUT);
		defaultOutPut.setDescription("The default output");
		defaultOutPut.setOutputDirectory("./dse-gen");
		defaultOutPut.setOverrideExistingResources(true);
		defaultOutPut.setCreateOutputDirectory(true);
		defaultOutPut.setCleanUpDerivedResources(true);
		defaultOutPut.setSetDerivedProperty(true);	    
		return newHashSet(defaultOutPut);
	}
	

//    OutputConfiguration readonlyOutput = new OutputConfiguration(GEN_ONCE_OUTPUT);
//    readonlyOutput.setDescription("Read-only Output Folder");
//    readonlyOutput.setOutputDirectory("./src");
//    readonlyOutput.setOverrideExistingResources(false);
//    readonlyOutput.setCreateOutputDirectory(true);
//    readonlyOutput.setCleanUpDerivedResources(false);
//    readonlyOutput.setSetDerivedProperty(false);
//


}
