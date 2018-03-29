DESCRIPTION = "A fully functional image to run EDISON"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
LICENSE = "MIT"
#IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"
#IMAGE_INSTALL += "openssh-sftp-server"

IMAGE_LINGUAS = " "

INITRD = ""
INITRD_IMAGE = ""

# Do not use legacy nor EFI BIOS
PCBIOS = "0"
# Do not support bootable USB stick
NOISO = "1"
ROOTFS = ""

# Specify rootfs image type
IMAGE_FSTYPES = "btrfs"

#inherit core-image

# This has to be set after including core-image otherwise it's overriden with "1"
# and this cancel creation of the boot hddimg
NOHDD = "0"

#disabled this, don't know the effect
#inherit image-live
do_bootimg[depends] += "${PN}:do_rootfs"

IMAGE_ROOTFS_SIZE = "131072"

EXTRA_IMAGEDEPENDS += "lib32-u-boot"
#IMAGE_INSTALL += " lib32-u-boot"
