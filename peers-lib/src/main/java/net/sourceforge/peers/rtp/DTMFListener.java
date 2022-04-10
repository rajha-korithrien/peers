package net.sourceforge.peers.rtp;

public interface DTMFListener {

    public void processDTMF(RtpPacket dtmfPacket);
}
