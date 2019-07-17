package jdk.jfr;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import jdk.jfr.internal.PlatformRecorder;
import jdk.jfr.internal.PlatformRecording;
import jdk.jfr.internal.Type;
import jdk.jfr.internal.Utils;
import jdk.jfr.internal.WriteableUserPath;

public final class Recording implements Closeable {

    private static class RecordingSettings extends EventSettings {

        RecordingSettings(Recording r, String identifier) {
        }

        RecordingSettings(Recording r, Class<? extends Event> eventClass) {
        }

        @Override
        public EventSettings with(String name, String value) {
        	return null;
        }

        @Override
        public Map<String, String> toMap() {
            return null;
        }
    }

    public Recording(Map<String, String> settings) {
    }

    public Recording() {
    }

    public Recording(Configuration configuration) {
    }

    public void start() {
    }

    public void scheduleStart(Duration delay) {
    }

    public boolean stop() {
        return false;
    }

    public Map<String, String> getSettings() {
        return null;
    }

    public long getSize() {
        return null;
    }

    public Instant getStopTime() {
        return null;
    }

    public Instant getStartTime() {
        return null;
    }

    public long getMaxSize() {
        return 0;
    }

    public Duration getMaxAge() {
        return null;
    }

    public String getName() {
        return null;
    }

    public void setSettings(Map<String, String> settings) {
    }

    public RecordingState getState() {
        return null;
    }

    @Override
    public void close() {
    }

    public Recording copy(boolean stop) {
        return null;
    }

    public void dump(Path destination) throws IOException {
    }

    public boolean isToDisk() {
        return false;
    }

    public void setMaxSize(long maxSize) {
    }

    public void setMaxAge(Duration maxAge) {
    }

    public void setDestination(Path destination) throws IOException {
    }

    public Path getDestination() {
    	return null;
    }

    public long getId() {
        return 0;
    }

    public void setName(String name) {
    }

    public void setDumpOnExit(boolean dumpOnExit) {
    }

    public boolean getDumpOnExit() {
        return false;
    }

    public void setToDisk(boolean disk) {
    }

    public InputStream getStream(Instant start, Instant end) throws IOException {
    	return null;
    }

    public Duration getDuration() {
        return null;
    }

    public void setDuration(Duration duration) {
    }

    public EventSettings enable(String name) {
    	return null;
    }

    public EventSettings disable(String name) {
    	return null;
    }

    public EventSettings enable(Class<? extends Event> eventClass) {
    	return null;
    }

    public EventSettings disable(Class<? extends Event> eventClass) {
    	return null;
    }

    PlatformRecording getInternal() {
        return null;
    }

    private void setSetting(String id, String value) {
    }

}
