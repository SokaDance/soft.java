package soft.generator.ts;

import org.eclipse.emf.common.util.BasicMonitor;

import soft.generator.common.Generator;

/**
 * Entry point of the 'Generate' generation module.
 * 
 * @generated NOT
 */
public class Generate extends Generator {
    /**
     * The name of the module.
     */
    public static final String MODULE_FILE_NAME = "/soft/generator/ts/generate";

    /**
     * The namespace URI of the TypeScript generator
     */
    public static final String NS_URI = "http://net.masagroup/soft/2020/GenTS";

    /**
     * The name of the templates that are to be generated.
     */
    public static final String[] TEMPLATE_NAMES = { "generateModel", "generateModule", "generateTests" };

    private Generate() {
        super(MODULE_FILE_NAME, NS_URI, TEMPLATE_NAMES);
    }

    public static void main(String[] args) {
        try {
            Generate g = new Generate();
            boolean p = g.parse(args);
            if (p) {
                g.initialize();
                g.generate(new BasicMonitor());
            }
        } catch (Exception e) {

        }
    }

}
