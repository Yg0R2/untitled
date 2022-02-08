package org.yg0r2;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.EnvVars;
import hudson.Extension;
import hudson.model.AbstractProject;
import hudson.model.Run;
import hudson.model.TaskListener;
import hudson.tasks.BuildStepDescriptor;
import hudson.tasks.Builder;
import jenkins.tasks.SimpleBuildStep;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;
import org.yg0r2.action.DummyAction;

import java.io.IOException;

public class DummyStep extends Builder implements SimpleBuildStep {

    @DataBoundConstructor
    public DummyStep() {
        // ignore
    }

    @Override
    public void perform(@NonNull Run<?, ?> run, @NonNull EnvVars env, @NonNull TaskListener listener) throws InterruptedException, IOException {
        new DummyAction().sayHello();
    }

    @Extension
    @Symbol("dummy")
    public static final class SetReleaseVersionStepDescriptor extends BuildStepDescriptor<Builder> {

        @Override
        public boolean isApplicable(Class<? extends AbstractProject> jobType) {
            return true;
        }

    }

}
