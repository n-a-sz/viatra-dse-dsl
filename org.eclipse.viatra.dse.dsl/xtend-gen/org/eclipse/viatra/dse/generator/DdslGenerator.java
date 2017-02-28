package org.eclipse.viatra.dse.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.dse.dsl.model.BaseObjective;
import org.eclipse.viatra.dse.dsl.model.BaseStrategy;
import org.eclipse.viatra.dse.dsl.model.Comparators;
import org.eclipse.viatra.dse.dsl.model.Configuration;
import org.eclipse.viatra.dse.dsl.model.ConstraintsObjective;
import org.eclipse.viatra.dse.dsl.model.DseExecutionModel;
import org.eclipse.viatra.dse.dsl.model.DseProblem;
import org.eclipse.viatra.dse.dsl.model.EvolutionStrategyType;
import org.eclipse.viatra.dse.dsl.model.EvolutionaryStrategyBuilder;
import org.eclipse.viatra.dse.dsl.model.IMutationRate;
import org.eclipse.viatra.dse.dsl.model.InitialModel;
import org.eclipse.viatra.dse.dsl.model.MetaModel;
import org.eclipse.viatra.dse.dsl.model.QueryConstraint;
import org.eclipse.viatra.dse.dsl.model.SolutionStore;
import org.eclipse.viatra.dse.dsl.model.StateCoder;
import org.eclipse.viatra.dse.dsl.model.Strategy;
import org.eclipse.viatra.dse.dsl.model.StrategyType;
import org.eclipse.viatra.dse.dsl.model.TransformationRule;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DdslGenerator extends AbstractGenerator {
  private static Set<String> set;
  
  public DdslGenerator() {
    HashSet<String> _hashSet = new HashSet<String>();
    DdslGenerator.set = _hashSet;
    DdslGenerator.set.add("java.io.IOException");
    DdslGenerator.set.add("java.io.PrintWriter");
    DdslGenerator.set.add("java.io.File");
    DdslGenerator.set.add("org.eclipse.viatra.dse.evolutionary.EvolutionaryStrategyBuilder");
    DdslGenerator.set.add("org.eclipse.emf.ecore.EObject");
    DdslGenerator.set.add("org.eclipse.viatra.dse.api.DesignSpaceExplorer");
    DdslGenerator.set.add("org.eclipse.viatra.dse.api.Strategies");
    DdslGenerator.set.add("org.eclipse.viatra.dse.objectives.Comparators");
    DdslGenerator.set.add("org.eclipse.viatra.dse.objectives.impl.ConstraintsObjective");
    DdslGenerator.set.add("org.eclipse.viatra.dse.solutionstore.SolutionStore");
    DdslGenerator.set.add("org.eclipse.viatra.query.runtime.exception.ViatraQueryException");
    DdslGenerator.set.add("org.eclipse.viatra.dse.statecoding.simple.SimpleStateCoderFactory");
    DdslGenerator.set.add("org.junit.Test");
    DdslGenerator.set.add("org.eclipse.emf.ecore.EObject");
    DdslGenerator.set.add("org.eclipse.emf.ecore.EPackage");
    DdslGenerator.set.add("com.google.common.base.Stopwatch");
    DdslGenerator.set.add("java.io.FileWriter");
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterator<DseExecutionModel> _filter = Iterators.<DseExecutionModel>filter(_allContents, DseExecutionModel.class);
    Iterable<DseExecutionModel> _iterable = IteratorExtensions.<DseExecutionModel>toIterable(_filter);
    for (final DseExecutionModel model : _iterable) {
      String _packageName = model.getPackageName();
      String _packageDeclaration = DdslGenerator.getPackageDeclaration(_packageName);
      String _plus = (_packageDeclaration + "/DseExecution");
      String _name = model.getName();
      String _plus_1 = (_plus + _name);
      String _plus_2 = (_plus_1 + ".java");
      CharSequence _createClass = DdslGenerator.createClass(model);
      fsa.generateFile(_plus_2, _createClass);
    }
  }
  
  public static String getPackageDeclaration(final String strPackage) {
    String[] segments = strPackage.split("\\.");
    int _length = strPackage.length();
    String _replace = strPackage.replace(".", "");
    int _length_1 = _replace.length();
    int count = (_length - _length_1);
    String newPackage = "";
    InputOutput.<Integer>println(Integer.valueOf(count));
    if ((count > 0)) {
      for (final String segment : segments) {
        {
          InputOutput.<String>println(segment);
          newPackage = ((newPackage + "/") + segment);
        }
      }
    }
    return newPackage;
  }
  
  /**
   * Templates start here
   */
  public static String firstLetterToUpper(final String str) {
    String _substring = str.substring(0, 1);
    String _upperCase = _substring.toUpperCase();
    String _substring_1 = str.substring(1);
    return (_upperCase + _substring_1);
  }
  
  public static String createRuleName(final String methodName) {
    String _replaceAll = methodName.replaceAll("[.]", "");
    return ("rule" + _replaceAll);
  }
  
  public static void addImports(final DseProblem problem) {
    EList<String> _imports = problem.getImports();
    for (final String imports : _imports) {
      DdslGenerator.set.add(imports);
    }
    for (final String imp : DdslGenerator.set) {
      InputOutput.<String>println(imp);
    }
  }
  
  public static CharSequence createImports() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String imp : DdslGenerator.set) {
        _builder.append("import ");
        _builder.append(imp, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createDseInicialization(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      InitialModel _initialmodel = problem.getInitialmodel();
      String _path = _initialmodel.getPath();
      boolean _contains = _path.contains("(");
      if (_contains) {
        _builder.append("EObject model = ");
        InitialModel _initialmodel_1 = problem.getInitialmodel();
        String _path_1 = _initialmodel_1.getPath();
        _builder.append(_path_1, "");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("EObject model = ");
        InitialModel _initialmodel_2 = problem.getInitialmodel();
        String _path_2 = _initialmodel_2.getPath();
        _builder.append(_path_2, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("DesignSpaceExplorer dse = new DesignSpaceExplorer();");
    _builder.newLine();
    _builder.append("dse.setInitialModel(model);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("dse.addMetaModelPackage(EPackage.Registry.INSTANCE.getEPackage(\"");
    MetaModel _metamodel = problem.getMetamodel();
    String _name = _metamodel.getName();
    _builder.append(_name, "");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
    {
      StateCoder _statecoder = problem.getStatecoder();
      boolean _notEquals = (!Objects.equal(_statecoder, null));
      if (_notEquals) {
        _builder.append("dse.setStateCoderFactory(new ");
        StateCoder _statecoder_1 = problem.getStatecoder();
        String _name_1 = _statecoder_1.getName();
        _builder.append(_name_1, "");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      StateCoder _statecoder_2 = problem.getStatecoder();
      boolean _equals = Objects.equal(_statecoder_2, null);
      if (_equals) {
        _builder.append("dse.setStateCoderFactory(new SimpleStateCoderFactory(dse.getMetaModelPackages()));");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence createDseRules(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      EList<TransformationRule> _transformationrules = problem.getTransformationrules();
      for(final TransformationRule rule : _transformationrules) {
        String _className = rule.getClassName();
        _builder.append(_className, "");
        _builder.append(" ");
        String _methodName = rule.getMethodName();
        String _createRuleName = DdslGenerator.createRuleName(_methodName);
        _builder.append(_createRuleName, "");
        _builder.append(" = new ");
        String _className_1 = rule.getClassName();
        _builder.append(_className_1, "");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("dse.addTransformationRule(");
        String _methodName_1 = rule.getMethodName();
        String _createRuleName_1 = DdslGenerator.createRuleName(_methodName_1);
        _builder.append(_createRuleName_1, "");
        _builder.append(".");
        String _methodName_2 = rule.getMethodName();
        _builder.append(_methodName_2, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public static CharSequence createDseObjectives(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<BaseObjective> _objectives = problem.getObjectives();
      for(final BaseObjective objective : _objectives) {
        {
          if ((objective instanceof ConstraintsObjective)) {
            _builder.append("dse.addObjective(new ConstraintsObjective()");
            _builder.newLine();
            {
              EList<QueryConstraint> _hardConstraints = ((ConstraintsObjective)objective).getHardConstraints();
              for(final QueryConstraint hardObjective : _hardConstraints) {
                _builder.append(".withHardConstraint(\"");
                String _name = hardObjective.getName();
                _builder.append(_name, "");
                _builder.append("\", ");
                String _constraintName = hardObjective.getConstraintName();
                String _firstLetterToUpper = DdslGenerator.firstLetterToUpper(_constraintName);
                _builder.append(_firstLetterToUpper, "");
                _builder.append("QuerySpecification.instance())");
                _builder.newLineIfNotEmpty();
              }
            }
            {
              EList<QueryConstraint> _softConstraints = ((ConstraintsObjective)objective).getSoftConstraints();
              for(final QueryConstraint softObjective : _softConstraints) {
                _builder.append(".withSoftConstraint(\"");
                String _name_1 = softObjective.getName();
                _builder.append(_name_1, "");
                _builder.append("\", ");
                String _constraintName_1 = softObjective.getConstraintName();
                String _firstLetterToUpper_1 = DdslGenerator.firstLetterToUpper(_constraintName_1);
                _builder.append(_firstLetterToUpper_1, "");
                _builder.append("QuerySpecification.instance(), ");
                double _weight = softObjective.getWeight();
                _builder.append(_weight, "");
                _builder.append(")");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append(".withComparator(Comparators.");
            Comparators _comparator = ((ConstraintsObjective)objective).getComparator();
            _builder.append(_comparator, "");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append(");");
            _builder.newLine();
          }
        }
        {
          if ((!(objective instanceof ConstraintsObjective))) {
            _builder.append("dse.addObjective(new ");
            String _name_2 = objective.getName();
            _builder.append(_name_2, "");
            _builder.append("());");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence createDseSolutionStore(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("dse.setSolutionStore(new SolutionStore()");
    _builder.newLine();
    {
      SolutionStore _solutionstore = problem.getSolutionstore();
      boolean _notEquals = (!Objects.equal(_solutionstore, null));
      if (_notEquals) {
        {
          SolutionStore _solutionstore_1 = problem.getSolutionstore();
          boolean _isStoreBestSolutionsOnly = _solutionstore_1.isStoreBestSolutionsOnly();
          if (_isStoreBestSolutionsOnly) {
            _builder.append(".storeBestSolutionsOnly()");
            _builder.newLine();
          }
        }
        {
          SolutionStore _solutionstore_2 = problem.getSolutionstore();
          boolean _isAcceptAnySolutions = _solutionstore_2.isAcceptAnySolutions();
          if (_isAcceptAnySolutions) {
            _builder.append(".acceptAnySolutions()");
            _builder.newLine();
          }
        }
        {
          SolutionStore _solutionstore_3 = problem.getSolutionstore();
          boolean _isLogSolutionsWhenFound = _solutionstore_3.isLogSolutionsWhenFound();
          if (_isLogSolutionsWhenFound) {
            _builder.append(".logSolutionsWhenFound()");
            _builder.newLine();
          }
        }
        {
          SolutionStore _solutionstore_4 = problem.getSolutionstore();
          boolean _isRegisterSolutionFoundHandler = _solutionstore_4.isRegisterSolutionFoundHandler();
          if (_isRegisterSolutionFoundHandler) {
          }
        }
      }
    }
    _builder.append(");");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createStategy(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Configuration _configurations = problem.getConfigurations();
      BaseStrategy _strategy = _configurations.getStrategy();
      StrategyType _type = ((Strategy) _strategy).getType();
      boolean _equals = Objects.equal(_type, StrategyType.BFS_STRATEGY);
      if (_equals) {
        _builder.append("dse.startExploration(Strategies.createBfsStrategy(");
        {
          Configuration _configurations_1 = problem.getConfigurations();
          BaseStrategy _strategy_1 = _configurations_1.getStrategy();
          int _depth = ((Strategy) _strategy_1).getDepth();
          boolean _greaterThan = (_depth > 0);
          if (_greaterThan) {
            Configuration _configurations_2 = problem.getConfigurations();
            BaseStrategy _strategy_2 = _configurations_2.getStrategy();
            int _depth_1 = ((Strategy) _strategy_2).getDepth();
            _builder.append(_depth_1, "");
          }
        }
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Configuration _configurations_3 = problem.getConfigurations();
      BaseStrategy _strategy_3 = _configurations_3.getStrategy();
      StrategyType _type_1 = ((Strategy) _strategy_3).getType();
      boolean _equals_1 = Objects.equal(_type_1, StrategyType.DFS_STRATEGY);
      if (_equals_1) {
        _builder.append("dse.startExploration(Strategies.createDfsStrategy(");
        {
          Configuration _configurations_4 = problem.getConfigurations();
          BaseStrategy _strategy_4 = _configurations_4.getStrategy();
          int _depth_2 = ((Strategy) _strategy_4).getDepth();
          boolean _greaterThan_1 = (_depth_2 > 0);
          if (_greaterThan_1) {
            Configuration _configurations_5 = problem.getConfigurations();
            BaseStrategy _strategy_5 = _configurations_5.getStrategy();
            int _depth_3 = ((Strategy) _strategy_5).getDepth();
            _builder.append(_depth_3, "");
          }
        }
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Configuration _configurations_6 = problem.getConfigurations();
      BaseStrategy _strategy_6 = _configurations_6.getStrategy();
      StrategyType _type_2 = ((Strategy) _strategy_6).getType();
      boolean _equals_2 = Objects.equal(_type_2, StrategyType.FIXED_PRIORITY_STRATEGY);
      if (_equals_2) {
        _builder.append("dse.startExploration(Strategies.createFixedPriorityStrategy(");
        {
          Configuration _configurations_7 = problem.getConfigurations();
          BaseStrategy _strategy_7 = _configurations_7.getStrategy();
          int _depth_4 = ((Strategy) _strategy_7).getDepth();
          boolean _greaterThan_2 = (_depth_4 > 0);
          if (_greaterThan_2) {
            Configuration _configurations_8 = problem.getConfigurations();
            BaseStrategy _strategy_8 = _configurations_8.getStrategy();
            int _depth_5 = ((Strategy) _strategy_8).getDepth();
            _builder.append(_depth_5, "");
          }
        }
        _builder.append("));");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      Configuration _configurations_9 = problem.getConfigurations();
      BaseStrategy _strategy_9 = _configurations_9.getStrategy();
      StrategyType _type_3 = ((Strategy) _strategy_9).getType();
      boolean _equals_3 = Objects.equal(_type_3, StrategyType.HILL_CLIMBING_STRATEGY);
      if (_equals_3) {
        _builder.append("dse.startExploration(Strategies.creatHillClimbingStrategy());");
        _builder.newLine();
      }
    }
    return _builder;
  }
  
  public static CharSequence createEvolutionStrategy(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Configuration _configurations = problem.getConfigurations();
      BaseStrategy _strategy = _configurations.getStrategy();
      EvolutionStrategyType _type = ((EvolutionaryStrategyBuilder) _strategy).getType();
      boolean _equals = Objects.equal(_type, EvolutionStrategyType.NSGA2);
      if (_equals) {
        _builder.append("EvolutionaryStrategyBuilder nsga2 = EvolutionaryStrategyBuilder.createNsga2BuilderFull(");
        Configuration _configurations_1 = problem.getConfigurations();
        BaseStrategy _strategy_1 = _configurations_1.getStrategy();
        int _populationSize = ((EvolutionaryStrategyBuilder) _strategy_1).getPopulationSize();
        _builder.append(_populationSize, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append("EvolutionaryStrategyBuilder nsga2 = EvolutionaryStrategyBuilder.createPesaBuilderFull(");
        Configuration _configurations_2 = problem.getConfigurations();
        BaseStrategy _strategy_2 = _configurations_2.getStrategy();
        int _populationSize_1 = ((EvolutionaryStrategyBuilder) _strategy_2).getPopulationSize();
        _builder.append(_populationSize_1, "");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Configuration _configurations_3 = problem.getConfigurations();
      BaseStrategy _strategy_3 = _configurations_3.getStrategy();
      EList<IMutationRate> _mutations = ((EvolutionaryStrategyBuilder) _strategy_3).getMutations();
      for(final IMutationRate mutation : _mutations) {
        _builder.append("nsga2.addMutation(new ");
        String _name = mutation.getName();
        _builder.append(_name, "");
        _builder.append("() ");
        {
          int _weight = mutation.getWeight();
          boolean _greaterThan = (_weight > 0);
          if (_greaterThan) {
            _builder.append(", ");
            int _weight_1 = mutation.getWeight();
            _builder.append(_weight_1, "");
            _builder.append(" ");
          }
        }
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      Configuration _configurations_4 = problem.getConfigurations();
      BaseStrategy _strategy_4 = _configurations_4.getStrategy();
      EList<String> _crossOvers = ((EvolutionaryStrategyBuilder) _strategy_4).getCrossOvers();
      for(final String crossover : _crossOvers) {
        _builder.append("nsga2.addCrossover(new ");
        _builder.append(crossover, "");
        _builder.append("());");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("dse.startExploration(nsga2.build());");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createConfiguration(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Configuration _configurations = problem.getConfigurations();
      BaseStrategy _strategy = _configurations.getStrategy();
      boolean _notEquals = (!Objects.equal(_strategy, null));
      if (_notEquals) {
        {
          Configuration _configurations_1 = problem.getConfigurations();
          BaseStrategy _strategy_1 = _configurations_1.getStrategy();
          if ((_strategy_1 instanceof Strategy)) {
            CharSequence _createStategy = DdslGenerator.createStategy(problem);
            _builder.append(_createStategy, "");
            _builder.newLineIfNotEmpty();
          } else {
            CharSequence _createEvolutionStrategy = DdslGenerator.createEvolutionStrategy(problem);
            _builder.append(_createEvolutionStrategy, "");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder;
  }
  
  public static CharSequence createRunMethod(final DseProblem problem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public void run");
    String _name = problem.getName();
    _builder.append(_name, "");
    _builder.append("(Boolean isFirstRun)throws IOException, ViatraQueryException{");
    _builder.newLineIfNotEmpty();
    _builder.append("                ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createDseInicialization = DdslGenerator.createDseInicialization(problem);
    _builder.append(_createDseInicialization, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createDseRules = DdslGenerator.createDseRules(problem);
    _builder.append(_createDseRules, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createDseObjectives = DdslGenerator.createDseObjectives(problem);
    _builder.append(_createDseObjectives, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createDseSolutionStore = DdslGenerator.createDseSolutionStore(problem);
    _builder.append(_createDseSolutionStore, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createConfiguration = DdslGenerator.createConfiguration(problem);
    _builder.append(_createConfiguration, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("if(isFirstRun){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("System.out.println(dse.toStringSolutions());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createTestMethod(final DseExecutionModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@SuppressWarnings(\"deprecation\")");
    _builder.newLine();
    _builder.append("@Test");
    _builder.newLine();
    _builder.append("public void executeProblems() throws IOException, ViatraQueryException{");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("PrintWriter pw = new PrintWriter(new File(\"");
    String _name = model.getName();
    _builder.append(_name, "    ");
    _builder.append("_results.csv\"));");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("StringBuilder sb = new StringBuilder();");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Stopwatch watch = new Stopwatch();        ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("long time = 0;");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"number of runs\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\';\');");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"name of the problem\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\';\');");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"seconds\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\';\');");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"miliseconds\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\';\');");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"avarage\");");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("sb.append(\"\\n\");");
    _builder.newLine();
    {
      EList<DseProblem> _dseproblems = model.getDseproblems();
      for(final DseProblem problem : _dseproblems) {
        _builder.append("    ");
        _builder.append("  ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("time = 0;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("for(int i = 0; i< ");
        int _numberOfRuns = model.getNumberOfRuns();
        _builder.append(_numberOfRuns, "    ");
        _builder.append(";i++){");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("watch.reset();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("watch.start();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("if(i == 0){");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("run");
        String _name_1 = problem.getName();
        _builder.append(_name_1, "            ");
        _builder.append("(true);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}else{");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("        ");
        _builder.append("run");
        String _name_2 = problem.getName();
        _builder.append(_name_2, "            ");
        _builder.append("(false);");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("watch.stop();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("long timeElapsed = watch.elapsedMillis();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("long s = timeElapsed/1000;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("long ms = timeElapsed - s*1000;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("time += watch.elapsedMillis();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("long avg = time/(i+1);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(i+1);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(\';\');");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("       ");
        _builder.append("sb.append(\"");
        String _name_3 = problem.getName();
        _builder.append(_name_3, "           ");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(\";\");");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(s);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(\";\");");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(ms);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(\";\");");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(avg);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("sb.append(\"\\n\");");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("    ");
        _builder.append("System.out.println(\"seconds: \" + s + \" ms: \" + ms);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("sb.append(\"\\n\");                ");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("pw.write(sb.toString());");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("pw.close();");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public static CharSequence createClass(final DseExecutionModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packageName = model.getPackageName();
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<DseProblem> _dseproblems = model.getDseproblems();
      for(final DseProblem problem : _dseproblems) {
        DdslGenerator.addImports(problem);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    CharSequence _createImports = DdslGenerator.createImports();
    _builder.append(_createImports, "");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class DseExecution");
    String _name = model.getName();
    _builder.append(_name, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    {
      EList<DseProblem> _dseproblems_1 = model.getDseproblems();
      for(final DseProblem problem_1 : _dseproblems_1) {
        _builder.append("    ");
        CharSequence _createRunMethod = DdslGenerator.createRunMethod(problem_1);
        _builder.append(_createRunMethod, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("    ");
    CharSequence _createTestMethod = DdslGenerator.createTestMethod(model);
    _builder.append(_createTestMethod, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public void getOutputConfigurations() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
