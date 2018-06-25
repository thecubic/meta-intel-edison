LICENSE = "GPLv2"

KBRANCH ?= "master"

require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

PV = "4.16"

SRC_URI = "git://github.com/thecubic/linux.git;protocol=https \
        file://ftdi_sio.cfg \
        file://smsc95xx.cfg \
        file://bt_more.cfg \
        file://i2c_chardev.cfg \
        file://usb_phy.cfg \
        file://usb_dwc3.cfg \
        file://g_multi.cfg \
        file://shiny.cfg \
        "
#SRC_URI[md5sum] = "908e1f405739bb330715ecf71b396998"
#SRC_URI[sha256sum] = "7db5e45e603b9769597b9022ec9cc76688f78d8159bbe53bb061058b5eefc445"

SRCREV = "afef7d731842caadf269e07e6d104ac7d66fc459"

LINUX_VERSION ?= "4.16"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"

COMPATIBLE_MACHINE = "edison"
