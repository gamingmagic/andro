package org.apache.http.entity;

import android.support.p000v4.media.session.PlaybackStateCompat;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

public class InputStreamEntity extends AbstractHttpEntity {
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream inputStream) {
        this(inputStream, -1);
    }

    public InputStreamEntity(InputStream inputStream, long j) {
        this(inputStream, j, null);
    }

    public InputStreamEntity(InputStream inputStream, ContentType contentType) {
        this(inputStream, -1, contentType);
    }

    public InputStreamEntity(InputStream inputStream, long j, ContentType contentType) {
        this.content = (InputStream) Args.notNull(inputStream, "Source input stream");
        this.length = j;
        if (contentType != null) {
            setContentType(contentType.toString());
        }
    }

    public boolean isRepeatable() {
        return false;
    }

    public long getContentLength() {
        return this.length;
    }

    public InputStream getContent() {
        return this.content;
    }

    public void writeTo(OutputStream outputStream) {
        Args.notNull(outputStream, "Output stream");
        InputStream inputStream = this.content;
        try {
            byte[] bArr = new byte[4096];
            if (this.length >= 0) {
                long j = this.length;
                while (j > 0) {
                    int read = inputStream.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, j));
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                    j -= (long) read;
                }
            } else {
                while (true) {
                    int read2 = inputStream.read(bArr);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                }
            }
        } finally {
            inputStream.close();
        }
    }

    public boolean isStreaming() {
        return true;
    }
}
