# Repository contents
The repository hosts artifacts for the article *A Graph-Based Framework for Model-Driven Optimization Facilitating
Impact Analysis of Mutation Operator Properties* published at the Software and Systems Modeling (SoSyM) journal in 2023.  
DOI: <https://doi.org/10.1007/s10270-022-01078-x>

A summary of the original article has additionally been published at the Software Engineering conference 2024.  
DOI: <https://doi.org/10.18420/sw2024_6>

## MDEOptimiser ##
A precompiled version of the optimzation tool MDEOptimiser (as of 29th of Juli 2021) is contained as a command line version in the folder **MDEOptimiser**. 

## Use cases ##
All artifacts of the use cases are located in the folder **usecases**. 
The subfolder **models** contains the EMF meta-models, instance models and the Henshin model transformations used as element mutation operators.
The subfolder **src** contains the java implementation of the meta-models and, in the package **guidancefunctions**, the implementation of the functions inducing constraint and objective relations.
The configuration files used by MDEOptimiser to specify the different variants of evolutionary algorithms are located in the folder **configs**.

The use cases are provided as maven projects.
To build them, execute the command **mvn clean compile** in the folder **usecases**.
The build process may take some time as dependencies need to be resolved and downloaded.
The successful build was tested with Apache Maven 3.6.3 and Java 11.0.6. 
As the build configuration uses Tycho 2.0.0 newer Java versions (e.g. Java 16) might not allow for a successful build without adaptions.

## Running experiments in batches ##
To simplify the execution of a batch of experiments a bash script is contained in the main folder.
To run 30 evolutionary computations for all configurations of the CRA case, for example, a call to the script would look like:

**./experiment-runner.sh "usecases/CRA/target/classes/" "usecases/CRA/configs/" "usecases/CRA/"**

The results will be stored in a new folder inside the respective use case folder.
Please be aware that the MDEOptimiser argument specifying the path to the project folder (e.g. **usecases/CRA**) 
should not contain backwards navigation (e.g., **usescases/../usecases/CRA**) as an Exception is thrown by MDEOptimiser in this case.

## Results of the evaluation experiments ##
The detailed results of the experiments of the evaluation of the paper can be found in folder **results**.
More information can be found in the **README** contained in that folder.
